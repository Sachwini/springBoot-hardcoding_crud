package io.javabrains.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Services are typically singleton*/
@Service
public class TopicService {

    List<Topic> topics = new ArrayList<>(Arrays.asList(  /*Arrays.asList is immutable(can't edit) so to make it mutable we add new ArrayList<>*/
            new Topic("Spring","SpringFramework","SpringFrameWork Description"),
                new Topic("java","javaFramework","javaFrameWork Description"),
                new Topic("javaScript","javaScriptFramework","javaScriptFrameWork Description"),
                new Topic("Python","PythonFramework","PythonFrameWork Description")
        ));/*The return type will be in the form of json because of the use of @RestController that also handle to convert it into the json format */


public List<Topic> getAllTopics(){
    return topics;
}

public Topic getTopic(String id){
    return topics.stream().filter(x->x.getId().equals(id)).findFirst().get();
}

public void addTopic(Topic topic){
    topics.add(topic);
}

    public void updateTopic(String id, Topic topic) {
        for (int i = 0; i <topics.size() ; i++) {
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i,topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t->t.getId().equals(id));// for a given topics if topics .getId equal to the given id, remove that topic
    }
}
