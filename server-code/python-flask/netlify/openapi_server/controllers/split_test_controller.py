import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.split_test import SplitTest  # noqa: E501
from openapi_server.models.split_test_setup import SplitTestSetup  # noqa: E501
from openapi_server import util


def create_split_test(site_id, branch_tests):  # noqa: E501
    """create_split_test

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param branch_tests: 
    :type branch_tests: dict | bytes

    :rtype: Union[SplitTest, Tuple[SplitTest, int], Tuple[SplitTest, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        branch_tests = SplitTestSetup.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def disable_split_test(site_id, split_test_id):  # noqa: E501
    """disable_split_test

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param split_test_id: 
    :type split_test_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def enable_split_test(site_id, split_test_id):  # noqa: E501
    """enable_split_test

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param split_test_id: 
    :type split_test_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_split_test(site_id, split_test_id):  # noqa: E501
    """get_split_test

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param split_test_id: 
    :type split_test_id: str

    :rtype: Union[SplitTest, Tuple[SplitTest, int], Tuple[SplitTest, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_split_tests(site_id):  # noqa: E501
    """get_split_tests

     # noqa: E501

    :param site_id: 
    :type site_id: str

    :rtype: Union[List[SplitTest], Tuple[List[SplitTest], int], Tuple[List[SplitTest], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_split_test(site_id, split_test_id, branch_tests):  # noqa: E501
    """update_split_test

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param split_test_id: 
    :type split_test_id: str
    :param branch_tests: 
    :type branch_tests: dict | bytes

    :rtype: Union[SplitTest, Tuple[SplitTest, int], Tuple[SplitTest, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        branch_tests = SplitTestSetup.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
