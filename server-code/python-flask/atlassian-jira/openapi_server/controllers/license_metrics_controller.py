import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.license_metric import LicenseMetric  # noqa: E501
from openapi_server import util


def get_approximate_application_license_count(application_key):  # noqa: E501
    """Get approximate application license count

    Returns the total approximate user account for a specific &#x60;jira licence application key&#x60;. Please note this information is cached with a 7-day lifecycle and could be stale at the time of call.  #### Application Key ####  An application key represents a specific version of Jira. See \\{@link ApplicationKey\\} for details  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param application_key: 
    :type application_key: str

    :rtype: Union[LicenseMetric, Tuple[LicenseMetric, int], Tuple[LicenseMetric, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_approximate_license_count():  # noqa: E501
    """Get approximate license count

    Returns the total approximate user account across all jira licenced application keys. Please note this information is cached with a 7-day lifecycle and could be stale at the time of call.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501


    :rtype: Union[LicenseMetric, Tuple[LicenseMetric, int], Tuple[LicenseMetric, int, Dict[str, str]]
    """
    return 'do some magic!'
