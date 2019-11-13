package com.lzc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by Liu Zicheng at 2019/11/13 10:57
 * 基于restful风格的webservice,客户端与服务端通讯可以传递xml数据,json数据
 * @XmlRootElement 指定对象序列化为xml或json数据是根节点的名称
 * xml:
 * <User>
 *     <id></id>
 *     <username></username>
 *     <city></city>
 * </User>
 * json:
 * {"User":{"id":100,"username":"tom","city":"深圳"}}
 */
@XmlRootElement(name = "User")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String city;

    private List<Car> cars = new ArrayList<Car>();
}
