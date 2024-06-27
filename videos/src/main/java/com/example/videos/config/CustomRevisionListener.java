package com.example.videos.config;

import org.hibernate.envers.RevisionListener;
import com.example.videos.entitis.audit.Revision;
public class CustomRevisionListener implements RevisionListener {
    public void newRevision(Object revisionEntity){final Revision revision = (Revision) revisionEntity;}
}
