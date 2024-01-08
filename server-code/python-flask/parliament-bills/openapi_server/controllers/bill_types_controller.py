import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.bill_type_category import BillTypeCategory  # noqa: E501
from openapi_server.models.bill_type_search_result import BillTypeSearchResult  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server import util


def api_v1_bill_types_get(category=None, skip=None, take=None):  # noqa: E501
    """Returns a list of Bill types.

     # noqa: E501

    :param category: 
    :type category: dict | bytes
    :param skip: 
    :type skip: int
    :param take: 
    :type take: int

    :rtype: Union[BillTypeSearchResult, Tuple[BillTypeSearchResult, int], Tuple[BillTypeSearchResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        category =  BillTypeCategory.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
