/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.pod.chat.project.shared.dialog;

import br.edu.ifpb.ads.pod.chat.project.shared.entity.Message;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 17/05/2017, 19:18:39
 */
public interface DialogDataMessage extends DialogData<Message> {

    public void removeByUser(String userId) 
            throws RemoteException;

    public List<Message> listMessageByUser(String userId) 
            throws RemoteException;
    
    public List<Message> listMessageByUserChat(String userId, String chatId)
            throws RemoteException;
    
}
