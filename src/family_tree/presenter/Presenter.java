package family_tree.presenter;

import family_tree.model.human.Human;
import family_tree.model.service.Service;
import family_tree.view.View;

import java.io.IOException;
import java.util.Scanner;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }
    public void addHuman(Human human) {
        service.addHuman(human);
    }
    public void sortByName(){
        service.sortByName();
        getInfo();
    }
    public void sortByAge(){
        service.sortByAge();
        getInfo();
    }
    public void getInfo(){
        String answer = service.getInfo();
        view.printAnswer(answer);
    }
    public void setConnection(Scanner scanner) {
        service.setConnection(scanner);
        getInfo();
    }
    public void save() throws IOException {
        service.save();
        System.out.println("Данные сохранены в файл");
    }
    public void load() throws IOException, ClassNotFoundException {
        service.load();
        System.out.println("Данные загружены из файла");
    }
    public Human createHuman(Scanner scanner){
        return service.createHuman(scanner);
    }
}
