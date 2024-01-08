import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.stage_reference_search_result import StageReferenceSearchResult  # noqa: E501
from openapi_server import util


def api_v1_stages_get(skip=None, take=None):  # noqa: E501
    """Returns a list of Bill stages.

     # noqa: E501

    :param skip: 
    :type skip: int
    :param take: 
    :type take: int

    :rtype: Union[StageReferenceSearchResult, Tuple[StageReferenceSearchResult, int], Tuple[StageReferenceSearchResult, int, Dict[str, str]]
    """
    return 'do some magic!'
