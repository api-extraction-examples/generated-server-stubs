import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.project_type import ProjectType  # noqa: E501
from openapi_server import util


def get_accessible_project_type_by_key(project_type_key):  # noqa: E501
    """Get accessible project type by key

    Returns a [project type](https://confluence.atlassian.com/x/Var1Nw) if it is accessible to the user.  **[Permissions](#permissions) required:** Permission to access Jira. # noqa: E501

    :param project_type_key: The key of the project type.
    :type project_type_key: str

    :rtype: Union[ProjectType, Tuple[ProjectType, int], Tuple[ProjectType, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_all_accessible_project_types():  # noqa: E501
    """Get licensed project types

    Returns all [project types](https://confluence.atlassian.com/x/Var1Nw) with a valid license. # noqa: E501


    :rtype: Union[List[ProjectType], Tuple[List[ProjectType], int], Tuple[List[ProjectType], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_all_project_types():  # noqa: E501
    """Get all project types

    Returns all [project types](https://confluence.atlassian.com/x/Var1Nw), whether or not the instance has a valid license for each type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None. # noqa: E501


    :rtype: Union[List[ProjectType], Tuple[List[ProjectType], int], Tuple[List[ProjectType], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_project_type_by_key(project_type_key):  # noqa: E501
    """Get project type by key

    Returns a [project type](https://confluence.atlassian.com/x/Var1Nw).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None. # noqa: E501

    :param project_type_key: The key of the project type.
    :type project_type_key: str

    :rtype: Union[ProjectType, Tuple[ProjectType, int], Tuple[ProjectType, int, Dict[str, str]]
    """
    return 'do some magic!'
