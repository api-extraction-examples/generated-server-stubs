import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.status_details import StatusDetails  # noqa: E501
from openapi_server import util


def get_status(id_or_name):  # noqa: E501
    """Get status

    Returns a status. The status must be associated with an active workflow to be returned.  If a name is used on more than one status, only the status found first is returned. Therefore, identifying the status by its ID may be preferable.  This operation can be accessed anonymously.  [Permissions](#permissions) required: None. # noqa: E501

    :param id_or_name: The ID or name of the status.
    :type id_or_name: str

    :rtype: Union[StatusDetails, Tuple[StatusDetails, int], Tuple[StatusDetails, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_statuses():  # noqa: E501
    """Get all statuses

    Returns a list of all statuses associated with active workflows.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None. # noqa: E501


    :rtype: Union[List[StatusDetails], Tuple[List[StatusDetails], int], Tuple[List[StatusDetails], int, Dict[str, str]]
    """
    return 'do some magic!'
