package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Task extends Model {

    public String user;

    public String action;

    public String object;

    public Task(String user, String action, String object){

        this.user = user;
        this.action = action;
        this.object = object;

    }


}
