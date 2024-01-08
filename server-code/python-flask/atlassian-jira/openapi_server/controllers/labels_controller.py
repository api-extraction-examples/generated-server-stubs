import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.page_bean_string import PageBeanString  # noqa: E501
from openapi_server import util


def get_all_labels(start_at=None, max_results=None):  # noqa: E501
    """Get all labels

    Returns a [paginated](#pagination) list of labels. # noqa: E501

    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int

    :rtype: Union[PageBeanString, Tuple[PageBeanString, int], Tuple[PageBeanString, int, Dict[str, str]]
    """
    return 'do some magic!'
