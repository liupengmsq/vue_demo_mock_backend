package pengliu.me.forfrontend;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

public class OrderWithFile {
    private Integer id;
    private String name;
    private MultipartFile image;

    @Override
    public String toString() {
        return "OrderWithFile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image=" + image.getOriginalFilename() +
                '}';
    }

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

    //将ignore放到getter方法上，表示在序列化对象的时候忽略此字段
    @JsonIgnore
    public MultipartFile getImage() {
        return image;
    }

    //没有在setter方法上放ignore，表示在反序列化的时候不忽略此字段
    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
