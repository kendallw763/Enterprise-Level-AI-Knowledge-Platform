package org.example.repositories;

import org.slf4j.Logger;
import org. slf4j.LoggerFactory;

public class repo {
    public static final Logger logger =
            LoggerFactory.getLogger(repo.class);

    public void repoLogger(){
        logger.info("Repo logger message");
    }

}
