package day14JDBC数据库连接;

public class user {
    private Integer id;
    private String name;
    private String qianbao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQianbao() {
        return qianbao;
    }

    public void setQianbao(String qianbao) {
        this.qianbao = qianbao;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qianbao='" + qianbao + '\'' +
                '}';
    }
}
