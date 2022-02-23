package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
public class Docter implements Staff, BeanNameAware {
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Docter{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    public void assist(){
        System.out.println("assisting");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Set Bean Name method is called");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post Construct method is called");
    }
}
