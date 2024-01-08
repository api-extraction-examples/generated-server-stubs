import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.bill_stage_sitting_search_result import BillStageSittingSearchResult  # noqa: E501
from openapi_server.models.house import House  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server import util


def get_sittings(house=None, date_from=None, date_to=None, skip=None, take=None):  # noqa: E501
    """Returns a list of Sittings.

     # noqa: E501

    :param house: 
    :type house: dict | bytes
    :param date_from: 
    :type date_from: str
    :param date_to: 
    :type date_to: str
    :param skip: 
    :type skip: int
    :param take: 
    :type take: int

    :rtype: Union[BillStageSittingSearchResult, Tuple[BillStageSittingSearchResult, int], Tuple[BillStageSittingSearchResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        house =  House.from_dict(connexion.request.get_json())  # noqa: E501
    date_from = util.deserialize_datetime(date_from)
    date_to = util.deserialize_datetime(date_to)
    return 'do some magic!'
