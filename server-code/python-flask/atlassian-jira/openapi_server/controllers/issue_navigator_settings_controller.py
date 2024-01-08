import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.column_item import ColumnItem  # noqa: E501
from openapi_server import util


def get_issue_navigator_default_columns():  # noqa: E501
    """Get issue navigator default columns

    Returns the default issue navigator columns.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501


    :rtype: Union[List[ColumnItem], Tuple[List[ColumnItem], int], Tuple[List[ColumnItem], int, Dict[str, str]]
    """
    return 'do some magic!'


def set_issue_navigator_default_columns(request_body=None):  # noqa: E501
    """Set issue navigator default columns

    Sets the default issue navigator columns.  The &#x60;columns&#x60; parameter accepts a navigable field value and is expressed as HTML form data. To specify multiple columns, pass multiple &#x60;columns&#x60; parameters. For example, in curl:  &#x60;curl -X PUT -d columns&#x3D;summary -d columns&#x3D;description https://your-domain.atlassian.net/rest/api/3/settings/columns&#x60;  If no column details are sent, then all default columns are removed.  A navigable field is one that can be used as a column on the issue navigator. Find details of navigable issue columns using [Get fields](#api-rest-api-3-field-get).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param request_body: A navigable field value.
    :type request_body: List[str]

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'
