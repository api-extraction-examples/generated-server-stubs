import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.project_category import ProjectCategory  # noqa: E501
from openapi_server.models.updated_project_category import UpdatedProjectCategory  # noqa: E501
from openapi_server import util


def create_project_category(project_category):  # noqa: E501
    """Create project category

    Creates a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param project_category: 
    :type project_category: dict | bytes

    :rtype: Union[ProjectCategory, Tuple[ProjectCategory, int], Tuple[ProjectCategory, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        project_category = ProjectCategory.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_all_project_categories():  # noqa: E501
    """Get all project categories

    Returns all project categories.  **[Permissions](#permissions) required:** Permission to access Jira. # noqa: E501


    :rtype: Union[List[ProjectCategory], Tuple[List[ProjectCategory], int], Tuple[List[ProjectCategory], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_project_category_by_id(id):  # noqa: E501
    """Get project category by ID

    Returns a project category.  **[Permissions](#permissions) required:** Permission to access Jira. # noqa: E501

    :param id: The ID of the project category.
    :type id: int

    :rtype: Union[ProjectCategory, Tuple[ProjectCategory, int], Tuple[ProjectCategory, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_project_category(id):  # noqa: E501
    """Delete project category

    Deletes a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: ID of the project category to delete.
    :type id: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_project_category(id, project_category):  # noqa: E501
    """Update project category

    Updates a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: 
    :type id: int
    :param project_category: 
    :type project_category: dict | bytes

    :rtype: Union[UpdatedProjectCategory, Tuple[UpdatedProjectCategory, int], Tuple[UpdatedProjectCategory, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        project_category = ProjectCategory.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
