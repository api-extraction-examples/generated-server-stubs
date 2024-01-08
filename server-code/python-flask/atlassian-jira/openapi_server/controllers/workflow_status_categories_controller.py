import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.status_category import StatusCategory  # noqa: E501
from openapi_server import util


def get_status_categories():  # noqa: E501
    """Get all status categories

    Returns a list of all status categories.  **[Permissions](#permissions) required:** Permission to access Jira. # noqa: E501


    :rtype: Union[List[StatusCategory], Tuple[List[StatusCategory], int], Tuple[List[StatusCategory], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_status_category(id_or_key):  # noqa: E501
    """Get status category

    Returns a status category. Status categories provided a mechanism for categorizing [statuses](#api-rest-api-3-status-idOrName-get).  **[Permissions](#permissions) required:** Permission to access Jira. # noqa: E501

    :param id_or_key: The ID or key of the status category.
    :type id_or_key: str

    :rtype: Union[StatusCategory, Tuple[StatusCategory, int], Tuple[StatusCategory, int, Dict[str, str]]
    """
    return 'do some magic!'
