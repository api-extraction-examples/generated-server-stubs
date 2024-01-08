import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_store_version_submission_create_request import AppStoreVersionSubmissionCreateRequest  # noqa: E501
from openapi_server.models.app_store_version_submission_response import AppStoreVersionSubmissionResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def app_store_version_submissions_create_instance(app_store_version_submission_create_request):  # noqa: E501
    """app_store_version_submissions_create_instance

     # noqa: E501

    :param app_store_version_submission_create_request: AppStoreVersionSubmission representation
    :type app_store_version_submission_create_request: dict | bytes

    :rtype: Union[AppStoreVersionSubmissionResponse, Tuple[AppStoreVersionSubmissionResponse, int], Tuple[AppStoreVersionSubmissionResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_store_version_submission_create_request = AppStoreVersionSubmissionCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def app_store_version_submissions_delete_instance(id):  # noqa: E501
    """app_store_version_submissions_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
