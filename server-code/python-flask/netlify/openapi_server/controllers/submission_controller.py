import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.submission import Submission  # noqa: E501
from openapi_server import util


def delete_submission(submission_id):  # noqa: E501
    """delete_submission

     # noqa: E501

    :param submission_id: 
    :type submission_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_form_submission(submission_id, query=None, page=None, per_page=None):  # noqa: E501
    """list_form_submission

     # noqa: E501

    :param submission_id: 
    :type submission_id: str
    :param query: 
    :type query: str
    :param page: 
    :type page: int
    :param per_page: 
    :type per_page: int

    :rtype: Union[List[Submission], Tuple[List[Submission], int], Tuple[List[Submission], int, Dict[str, str]]
    """
    return 'do some magic!'


def list_form_submissions(form_id, page=None, per_page=None):  # noqa: E501
    """list_form_submissions

     # noqa: E501

    :param form_id: 
    :type form_id: str
    :param page: 
    :type page: int
    :param per_page: 
    :type per_page: int

    :rtype: Union[List[Submission], Tuple[List[Submission], int], Tuple[List[Submission], int, Dict[str, str]]
    """
    return 'do some magic!'


def list_site_submissions(site_id, page=None, per_page=None):  # noqa: E501
    """list_site_submissions

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param page: 
    :type page: int
    :param per_page: 
    :type per_page: int

    :rtype: Union[List[Submission], Tuple[List[Submission], int], Tuple[List[Submission], int, Dict[str, str]]
    """
    return 'do some magic!'
