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


//    public static Finder<>

    public static String[] getLast(int x){

        return Task.find.query().where().eq;

    }
}
