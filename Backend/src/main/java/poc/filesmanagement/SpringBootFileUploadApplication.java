package poc.filesmanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import poc.filesmanagement.property.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class SpringBootFileUploadApplication implements CommandLineRunner {

//    @Resource
//    StorageService storageService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFileUploadApplication.class, args);
    }

    @Override
    public void run(String... arg) throws Exception {
//        storageService.deleteAll();
//        storageService.init();
    }
}
