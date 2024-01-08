import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server import util


def get_prometheus_metrics():  # noqa: E501
    """Query server for exposed Prometheus metrics

    See Prometheus documentation for a complete data model. # noqa: E501


    :rtype: Union[str, Tuple[str, int], Tuple[str, int, Dict[str, str]]
    """
    return 'do some magic!'
