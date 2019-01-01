package com.logicalenigma.springboot.servicecomments;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="comment", path="comment")
public interface CommentsRepository extends PagingAndSortingRepository<Comment, Long>{

}