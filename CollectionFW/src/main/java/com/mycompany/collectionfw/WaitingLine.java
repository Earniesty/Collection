/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collectionfw;
import java.time.LocalDateTime;
/**
 *
 * @author Dell
 */
public class WaitingLine {
    private static int seq = 0;
    private int queueId;
    private LocalDateTime inTime;
    
    public WaitingLine() {
        this.queueId = ++seq;
        this.inTime = LocalDateTime.now();
    }

    public int getQueueId() {
        return queueId;
    }

    public LocalDateTime getInTime() {
        return inTime;
    }

    @Override
    public String toString() {
        return "WaitingLine{" + "queueId=" + queueId + ", inTime=" + inTime + '}';
    }
    
}
