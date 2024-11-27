package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.entities.Member;

public class MemberService {
	 private List<Member> members; 

	    // Constructor
	    public MemberService() {
	        this.members = new ArrayList<>();
	    }

	    // Add a new member
	    public boolean addMember(Member member) {
	        if (members.stream().anyMatch(m -> m.getmemberId() == member.getmemberId())) {
	            System.out.println("Member with ID " + member.getmemberId() + " already exists.");
	            return false;
	        }
	        members.add(member);
	        System.out.println("==========================================");
	        System.out.println("Member added successfully: " + member);
	        return true;
	    }

	    // Find a member by ID
	    public Optional<Member> findMemberById(int memberId) {
	        return members.stream()
	                .filter(member -> member.getmemberId() == memberId)
	                .findFirst();
	    }

	    // List all members
	    public List<Member> listAllMembers() {
	        return new ArrayList<>(members);
	    }

	    // Remove a member by ID
	    public boolean removeMemberById(int memberId) {
	        Optional<Member> memberOptional = findMemberById(memberId);
	        if (memberOptional.isPresent()) {
	            members.remove(memberOptional.get());
	            System.out.println("Member with ID " + memberId + " has been removed.");
	            return true;
	        }
	        System.out.println("Member with ID " + memberId + " not found.");
	        return false;
	    }

	    // Update a member's information
	    public boolean updateMemberInfo(int memberId, String newName, String newEmail, String newPhoneNumber) {
	        Optional<Member> memberOptional = findMemberById(memberId);
	        if (memberOptional.isPresent()) {
	            Member member = memberOptional.get();
	            member.setname(newName);
	            member.setemail(newEmail);
	            member.setphonenumber(newPhoneNumber);
	            System.out.println("Member information updated: " + member);
	            return true;
	        }
	        System.out.println("Member with ID " + memberId + " not found.");
	        return false;
	    }

}
