package com.kkbible.service.sections.hhb.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kkbible.service.sections.hhb.domain.HhbSection;

public interface HhbSectionsRepository extends MongoRepository<HhbSection, String> {
	List<HhbSection> findByTestamentNoAndPieceNoAndChapterNoOrderBySectionNo(int testamentNo,int pieceNo,int chapterNo);
}
