package poateto.final4j.UseCases;

import poateto.final4j.Entity.User;

import java.util.concurrent.ExecutionException;

public interface UserUseCase {
    String saveUser(User user) throws ExecutionException, InterruptedException;
    User getUserByEmail(String email) throws ExecutionException, InterruptedException;
    String notifyModel(String email, String model, NotifyStatus status) throws ExecutionException, InterruptedException;
    String sendMessage(String email, String message) throws ExecutionException, InterruptedException;
}
