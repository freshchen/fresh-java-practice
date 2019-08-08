package create_and_destory;

import lombok.ToString;

import java.util.Set;

/**
 * @program: fresh-java-practice
 * @Date: 2019/8/8 20:58
 * @Author: Ling Chen
 * @Description:
 */
@ToString
public class BuildPerson {

    /**
     * 必要参数
     */
    private final String name;
    private final int idCard;
    /**
     * 可选参数
     */
    private final String gender;
    private final int age;
    private final String birthPlace;
    private final String education;
    private final Set hobbies;

    private BuildPerson(Builder builder) {
        name = builder.name;
        idCard = builder.idCard;
        gender = builder.gender;
        age = builder.age;
        birthPlace = builder.birthPlace;
        education = builder.education;
        hobbies = builder.hobbies;
    }

    public static class Builder {
        private final String name;
        private final int idCard;

        private String gender = "man";
        private int age = 0;
        private String birthPlace = "China";
        private String education = "undergraduate";
        private Set <String> hobbies = Set.of("game", "music");

        public Builder(String name, int idCard) {
            this.name = name;
            this.idCard = idCard;
        }

        public BuildPerson build() {
            return new BuildPerson(this);
        }


        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder birthPlace(String birthPlace) {
            this.birthPlace = birthPlace;
            return this;
        }

        public Builder education(String education) {
            this.education = education;
            return this;
        }

        public Builder hobbies(Set <String> hobbies) {
            this.hobbies = hobbies;
            return this;
        }
    }

    public static void main(String[] args) {
        BuildPerson person = new Builder("ling",123)
                .age(12)
                .birthPlace("Jiang Su")
                .education("master")
                .hobbies(Set.of("basketball", "football", "music"))
                .build();
        System.out.println(person.toString());
    }
}
