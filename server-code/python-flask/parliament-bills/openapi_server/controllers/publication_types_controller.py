import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.publication_type_search_result import PublicationTypeSearchResult  # noqa: E501
from openapi_server import util


def api_v1_publication_types_get(skip=None, take=None):  # noqa: E501
    """Returns a list of publication types.

     # noqa: E501

    :param skip: 
    :type skip: int
    :param take: 
    :type take: int

    :rtype: Union[PublicationTypeSearchResult, Tuple[PublicationTypeSearchResult, int], Tuple[PublicationTypeSearchResult, int, Dict[str, str]]
    """
    return 'do some magic!'
