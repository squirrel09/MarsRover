/**
 * Copy Right 2016 MarsRoverProject
 * @Version V1.0
 * @Title Container.java
 * @author Squirrel
 * @Date 2016��1��22��
 * @Description The interface for all containers
 */
package pers.squirrel.marsRover.container;

import java.util.List;

public interface Container {

	public void operation();

	public void register(List list);

	public void notifyObject();

}
