import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.project_email_address import ProjectEmailAddress  # noqa: E501
from openapi_server import util


def get_project_email(project_id):  # noqa: E501
    """Get project&#39;s sender email

    Returns the [project&#39;s sender email address](https://confluence.atlassian.com/x/dolKLg).  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project. # noqa: E501

    :param project_id: The project ID.
    :type project_id: int

    :rtype: Union[ProjectEmailAddress, Tuple[ProjectEmailAddress, int], Tuple[ProjectEmailAddress, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_project_email(project_id, project_email_address):  # noqa: E501
    """Set project&#39;s sender email

    Sets the [project&#39;s sender email address](https://confluence.atlassian.com/x/dolKLg).  If &#x60;emailAddress&#x60; is an empty string, the default email address is restored.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project. # noqa: E501

    :param project_id: The project ID.
    :type project_id: int
    :param project_email_address: The project&#39;s sender email address to be set.
    :type project_email_address: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        project_email_address = ProjectEmailAddress.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
