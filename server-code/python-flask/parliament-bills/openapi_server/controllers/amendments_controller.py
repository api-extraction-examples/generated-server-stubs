import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.amendment_detail import AmendmentDetail  # noqa: E501
from openapi_server.models.amendment_search_item_search_result import AmendmentSearchItemSearchResult  # noqa: E501
from openapi_server.models.decision import Decision  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server import util


def get_amendment(bill_id, bill_stage_id, amendment_id):  # noqa: E501
    """Returns an amendment.

     # noqa: E501

    :param bill_id: Amendment relating to a bill with bill ID specified
    :type bill_id: int
    :param bill_stage_id: Amendment relating to a bill stage with bill stage ID specified
    :type bill_stage_id: int
    :param amendment_id: Amendment with amendment ID specified
    :type amendment_id: int

    :rtype: Union[AmendmentDetail, Tuple[AmendmentDetail, int], Tuple[AmendmentDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_amendments(bill_id, bill_stage_id, search_term=None, decision=None, member_id=None, skip=None, take=None):  # noqa: E501
    """Returns a list of amendments.

     # noqa: E501

    :param bill_id: Amendments relating to a Bill with Bill ID specified
    :type bill_id: int
    :param bill_stage_id: Amendments relating to a Bill stage with Bill stage ID specified
    :type bill_stage_id: int
    :param search_term: 
    :type search_term: str
    :param decision: 
    :type decision: dict | bytes
    :param member_id: 
    :type member_id: int
    :param skip: 
    :type skip: int
    :param take: 
    :type take: int

    :rtype: Union[AmendmentSearchItemSearchResult, Tuple[AmendmentSearchItemSearchResult, int], Tuple[AmendmentSearchItemSearchResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        decision =  Decision.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
