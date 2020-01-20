<template>
  <div class="demo">
    <div>
      <h1>{{ title }}</h1>
    </div>
    <div>
      <h2 v-if="subtitleFlag">{{ subtitle }}</h2>
    </div>
    <div id="app-4">
      <ol>
        <li v-for="todo in todos">{{ todo.text }}</li>
      </ol>
    </div>
    <div id="app-5">
      <p>{{ message }}</p>
      <button @click="reverseMessage">反转消息</button>
    </div>
    <div id="app-6">
      <p>{{ message1 }}</p>
      <input v-model="message1" />
    </div>
    <div id="app-7">
      <p v-text="text">属性绑定</p>
    </div>
    <div id="app-8">
      <a href="www.baidu.com" :href="url">神秘链接</a>
    </div>
    <div id="example">
      <p>Original message: "{{ computeMessage }}"</p>
      <p>Computed reversed message: "{{ reversedMessageCompute }}"</p>
    </div>
    <div>
      <p>{{ watchMessage1 }}</p>
      <input v-model="watchMessage" />
    </div>
    <div>
      <p>{{ user.name }}</p>
      <p>{{ user.age }}</p>
      <button @click="getUser">axios请求</button>
    </div>
  </div>
</template>

<script>
export default {
  name: "Demo",
  data() {
    return {
      title: "Demo Page Tiitle",
      subtitle: "Can u see Subtitle ?",
      subtitleFlag: true,
      todos: [
        { text: "学习 JavaScript" },
        { text: "学习 Vue" },
        { text: "整个牛项目" }
      ],
      message: "清 晨 我 上 马",
      message1: "双向绑定",
      text: "V-text",
      attributeName: "href",
      url: "https://mvnrepository.com/repos/central",
      computeMessage: "计 算 属 性",
      watchMessage: "特工",
      watchMessage1: "监听",
      user: {
        name: "默认名",
        age: -1
      }
    };
  },
  computed: {
    //计算属性有缓存，数据不改变，不会重复计算
    reversedMessageCompute() {
      return this.computeMessage
        .split(" ")
        .reverse()
        .join(" ");
    }
  },
  watch: {
    watchMessage(val) {
      this.watchMessage1 = "监听" + val + "监听";
    }
  },
  methods: {
    reverseMessage() {
      this.message = this.message
        .split(" ")
        .reverse()
        .join(" ");
    },
    getUser() {
        this.$axios.get("/api/user")
        .then(res => {
            this.user = res.data
        })
        .catch(err => {
            console.error(err); 
        })
    }
  }
};
</script>

<style scoped>
</style>