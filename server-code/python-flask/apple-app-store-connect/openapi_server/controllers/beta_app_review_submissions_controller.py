import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.beta_app_review_submission_create_request import BetaAppReviewSubmissionCreateRequest  # noqa: E501
from openapi_server.models.beta_app_review_submission_response import BetaAppReviewSubmissionResponse  # noqa: E501
from openapi_server.models.beta_app_review_submissions_response import BetaAppReviewSubmissionsResponse  # noqa: E501
from openapi_server.models.build_response import BuildResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def beta_app_review_submissions_build_get_to_one_related(id, fields_builds=None):  # noqa: E501
    """beta_app_review_submissions_build_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_builds: the fields to include for returned resources of type builds
    :type fields_builds: List[str]

    :rtype: Union[BuildResponse, Tuple[BuildResponse, int], Tuple[BuildResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_app_review_submissions_create_instance(beta_app_review_submission_create_request):  # noqa: E501
    """beta_app_review_submissions_create_instance

     # noqa: E501

    :param beta_app_review_submission_create_request: BetaAppReviewSubmission representation
    :type beta_app_review_submission_create_request: dict | bytes

    :rtype: Union[BetaAppReviewSubmissionResponse, Tuple[BetaAppReviewSubmissionResponse, int], Tuple[BetaAppReviewSubmissionResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        beta_app_review_submission_create_request = BetaAppReviewSubmissionCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def beta_app_review_submissions_get_collection(filter_build, filter_beta_review_state=None, fields_beta_app_review_submissions=None, limit=None, include=None, fields_builds=None):  # noqa: E501
    """beta_app_review_submissions_get_collection

     # noqa: E501

    :param filter_build: filter by id(s) of related &#39;build&#39;
    :type filter_build: List[str]
    :param filter_beta_review_state: filter by attribute &#39;betaReviewState&#39;
    :type filter_beta_review_state: List[str]
    :param fields_beta_app_review_submissions: the fields to include for returned resources of type betaAppReviewSubmissions
    :type fields_beta_app_review_submissions: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_builds: the fields to include for returned resources of type builds
    :type fields_builds: List[str]

    :rtype: Union[BetaAppReviewSubmissionsResponse, Tuple[BetaAppReviewSubmissionsResponse, int], Tuple[BetaAppReviewSubmissionsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_app_review_submissions_get_instance(id, fields_beta_app_review_submissions=None, include=None, fields_builds=None):  # noqa: E501
    """beta_app_review_submissions_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_beta_app_review_submissions: the fields to include for returned resources of type betaAppReviewSubmissions
    :type fields_beta_app_review_submissions: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_builds: the fields to include for returned resources of type builds
    :type fields_builds: List[str]

    :rtype: Union[BetaAppReviewSubmissionResponse, Tuple[BetaAppReviewSubmissionResponse, int], Tuple[BetaAppReviewSubmissionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
