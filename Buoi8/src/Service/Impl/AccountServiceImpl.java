package Service.Impl;

import Service.AccountService;
import Service.Role;
import Service.Status;
import model.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl extends AuthServiceImpl implements AccountService {

    public AccountServiceImpl(ArrayList<Account> accounts, Account currentAccount) {
        super(accounts, currentAccount);
    }

    @Override
    public List<Account> getAllAccount() {
        return accounts;
    }

    @Override
    public void createNewAccount(Account account) {
        if (currentAccount.getRole() == Role.ADMIN) {
            accounts.add(account);
            System.out.println("Them tai khoan thanh cong");
        } else {
            System.out.println("Chi co admin moi duoc tao tai khoan");
        }
    }

    @Override
    public Account getAccountByUsername(String username) {
        for (Account account:accounts) {
            if (username.equals(account.getUsername())) {
                return account;
            }
        }
        return null;
    }

    @Override
    public void deleteAccount(String username) {
        boolean kt = false;
        for (Account account:accounts) {
            if (username.equals(account.getUsername())) {
                accounts.remove(account);
                kt = true;
                break;
            }
        }
        if (!kt) {
            System.out.println("Xoa tai khoan thanh cong");
        } else {
            System.out.println("Tai khoan nay khong ton tai");
        }
    }

    @Override
    public void changeStatus(String username, Status status) {
        boolean kt = false;
        for (Account account:accounts) {
            if (username.equals(account.getUsername())) {
                if (account.getStatus() == Status.ACTIVE) {
                    account.setStatus(Status.BAN);
                } else {
                    account.setStatus(Status.ACTIVE);
                }
                kt = true;
                break;
            }
        }
        if (kt) {
            System.out.println("Cap nhat trang thai thanh cong");
        } else {
            System.out.println("Khong ton tai tai username nay");
        }
    }

    public Account getCurrentAccount() {
        return currentAccount;
    }
}
