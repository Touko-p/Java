package 登录系统;

import java.util.*;

public class Show {
    private Map<String,User> use=null;

    public Show() {
        this.use = new HashMap<>();
    }
    //通过用户名获取用户
    public User getUserByUsername(String Username) throws UserNotFondExcepion{
        User u=use.get(Username);
        if(u==null)
            throw new UserNotFondExcepion("用户名不存在");
        return u;
    }
    //注册
    public void zc(String Username,String password,String name)throws UserNamePswExcepion{
        try {
            getUserByUsername(Username);
            throw new UserNamePswExcepion("账号已存在");
        }catch (UserNotFondExcepion e){
            use.put(Username,new User(Username,password,name));
        }
    }
    //登录
    public User login(String Username,String password)throws UserNamePswExcepion{
        User u=null;
        try {
            u=getUserByUsername(Username);
            if(u.getPassword().equals(password)){
                return u;
            }else {
                throw new UserNamePswExcepion("密码错误");
            }

        }catch (UserNotFondExcepion e){
            throw new UserNamePswExcepion("账号错误");
        }
    }
    //查找所有用户
    public List<User> getall(){
        Set<String> s=use.keySet();
        List<User> users=new ArrayList<>();
        for(String i:s){
            users.add(use.get(i));
        }
        return users;
    }
    //修改密码
    public void removepsw(String Username,String oldpsw,String newpsw)throws UserNamePswExcepion,UserNotFondExcepion{
        User u=null;
        try {
            u=getUserByUsername(Username);
            if(u.getPassword().equals(oldpsw)){
                u.setPassword(newpsw);
                use.put(Username,u);
            }else {
                throw new UserNamePswExcepion("密码错误，修改失败");
            }
        }catch (UserNotFondExcepion e){
            throw new UserNotFondExcepion("用户名不存在");
        }
    }
    //删除用户
    public void deleteUser(String Username)throws UserNotFondExcepion{
        if(use.containsKey(Username)){
            use.remove(Username);
        }else{
            throw new UserNotFondExcepion("用户不存在");
        }
    }
}
