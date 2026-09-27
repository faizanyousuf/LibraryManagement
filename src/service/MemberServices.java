package service;
import java.util.ArrayList;
import java.util.List;
import model.Member;
public class MemberServices {
         
    List<Member> members;

    public MemberServices(){
        members = new ArrayList<>();
    }

    public  void addMember(Member member){
        members.add(member);
    }

    public void removeMember(Member member){
           if(member == null){
            System.out.println("Provide a valid member");
           }
        for(Member m : members){
            if(m.getMemberId() == member.getMemberId()){
                members.remove(m);
                System.out.println("member Removed Successfully");
                break;
            }
        }
    }

    public Member searchMember(int id){
                 
        for(Member m : members){
            if(m.getMemberId() == id){
                return m;
            }
        }
        return null;
    }

    public List<Member> searchMember(String name){
            
        List<Member> result = new ArrayList<>();

        for(Member m : members){
            if(m.getName().toLowerCase().contains(name.toLowerCase())){
                 result.add(m);
            }
        }
        return result;
    }

    public List<Member> getAllMembers(){
        return members;
    }

}
