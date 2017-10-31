package com.kkbible.service.sections.hhb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kkbible.service.sections.hhb.dao.HhbSectionsRepository;
import com.kkbible.service.sections.hhb.domain.HhbSection;

@RestController
@RequestMapping("/bibles/hhb")
public class HhbSectionsController {

	@Autowired
	HhbSectionsRepository hhbSectionsRepository;
	
	@RequestMapping(value="/sections", method=RequestMethod.GET)
	public List<HhbSection> findByTestamentNoAndPieceNoAndChapterNo(int testamentNo,int pieceNo,int chapterNo) {
		List<HhbSection> sections = this.hhbSectionsRepository.findByTestamentNoAndPieceNoAndChapterNoOrderBySectionNo(testamentNo, pieceNo, chapterNo);
		return sections;
	}
}
