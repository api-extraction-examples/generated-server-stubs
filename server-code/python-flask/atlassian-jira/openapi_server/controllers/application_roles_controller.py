import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.application_role import ApplicationRole  # noqa: E501
from openapi_server import util


def get_all_application_roles():  # noqa: E501
    """Get all application roles

    Returns all application roles. In Jira, application roles are managed using the [Application access configuration](https://confluence.atlassian.com/x/3YxjL) page.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501


    :rtype: Union[List[ApplicationRole], Tuple[List[ApplicationRole], int], Tuple[List[ApplicationRole], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_application_role(key):  # noqa: E501
    """Get application role

    Returns an application role.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param key: The key of the application role. Use the [Get all application roles](#api-rest-api-3-applicationrole-get) operation to get the key for each application role.
    :type key: str

    :rtype: Union[ApplicationRole, Tuple[ApplicationRole, int], Tuple[ApplicationRole, int, Dict[str, str]]
    """
    return 'do some magic!'
