import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.bill import Bill  # noqa: E501
from openapi_server.models.bill_sort_order import BillSortOrder  # noqa: E501
from openapi_server.models.bill_stage_details import BillStageDetails  # noqa: E501
from openapi_server.models.bill_summary_search_result import BillSummarySearchResult  # noqa: E501
from openapi_server.models.house import House  # noqa: E501
from openapi_server.models.originating_house import OriginatingHouse  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.stage_summary_search_result import StageSummarySearchResult  # noqa: E501
from openapi_server import util


def api_v1_bills_bill_id_stages_get(bill_id, skip=None, take=None):  # noqa: E501
    """Returns all Bill stages.

     # noqa: E501

    :param bill_id: Stages relating to a Bill with Bill ID specified
    :type bill_id: int
    :param skip: 
    :type skip: int
    :param take: 
    :type take: int

    :rtype: Union[StageSummarySearchResult, Tuple[StageSummarySearchResult, int], Tuple[StageSummarySearchResult, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_bill(bill_id):  # noqa: E501
    """Return a Bill.

     # noqa: E501

    :param bill_id: Bill with ID specified
    :type bill_id: int

    :rtype: Union[Bill, Tuple[Bill, int], Tuple[Bill, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_bill_stage_details(bill_id, bill_stage_id):  # noqa: E501
    """Returns a Bill stage.

     # noqa: E501

    :param bill_id: Bill stage relating to Bill with Bill ID specified
    :type bill_id: int
    :param bill_stage_id: Bill stage with ID specified
    :type bill_stage_id: int

    :rtype: Union[BillStageDetails, Tuple[BillStageDetails, int], Tuple[BillStageDetails, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_bills(search_term=None, session=None, current_house=None, originating_house=None, member_id=None, department_id=None, bill_stage=None, bill_stages_excluded=None, is_defeated=None, is_withdrawn=None, bill_type=None, sort_order=None, bill_ids=None, skip=None, take=None):  # noqa: E501
    """Returns a list of Bills.

     # noqa: E501

    :param search_term: 
    :type search_term: str
    :param session: 
    :type session: int
    :param current_house: 
    :type current_house: dict | bytes
    :param originating_house: 
    :type originating_house: dict | bytes
    :param member_id: 
    :type member_id: int
    :param department_id: 
    :type department_id: int
    :param bill_stage: 
    :type bill_stage: List[int]
    :param bill_stages_excluded: 
    :type bill_stages_excluded: List[int]
    :param is_defeated: 
    :type is_defeated: bool
    :param is_withdrawn: 
    :type is_withdrawn: bool
    :param bill_type: 
    :type bill_type: List[int]
    :param sort_order: 
    :type sort_order: dict | bytes
    :param bill_ids: 
    :type bill_ids: List[int]
    :param skip: 
    :type skip: int
    :param take: 
    :type take: int

    :rtype: Union[BillSummarySearchResult, Tuple[BillSummarySearchResult, int], Tuple[BillSummarySearchResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        current_house =  House.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        originating_house =  OriginatingHouse.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        sort_order =  BillSortOrder.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
