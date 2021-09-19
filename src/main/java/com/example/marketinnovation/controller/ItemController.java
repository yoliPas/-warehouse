/**
 * @author: yolanda pascual
 */

package com.sales.market.controller;

import com.sales.market.dto.ItemDto;
import com.sales.market.model.Item;
import com.sales.market.service.ItemService;
import com.sales.market.service.GenericService;


@RestController
@RequestMapping("")
public class ItemController extends GenericController<Item, ItemDto> {

}