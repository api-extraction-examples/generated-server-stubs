import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.audit_log import AuditLog  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def list_account_audit_events(account_id, query=None, log_type=None, page=None, per_page=None):  # noqa: E501
    """list_account_audit_events

     # noqa: E501

    :param account_id: 
    :type account_id: str
    :param query: 
    :type query: str
    :param log_type: 
    :type log_type: str
    :param page: 
    :type page: int
    :param per_page: 
    :type per_page: int

    :rtype: Union[List[AuditLog], Tuple[List[AuditLog], int], Tuple[List[AuditLog], int, Dict[str, str]]
    """
    return 'do some magic!'
