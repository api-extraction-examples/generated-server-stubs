import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.build_beta_detail_response import BuildBetaDetailResponse  # noqa: E501
from openapi_server.models.build_beta_detail_update_request import BuildBetaDetailUpdateRequest  # noqa: E501
from openapi_server.models.build_beta_details_response import BuildBetaDetailsResponse  # noqa: E501
from openapi_server.models.build_response import BuildResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def build_beta_details_build_get_to_one_related(id, fields_builds=None):  # noqa: E501
    """build_beta_details_build_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_builds: the fields to include for returned resources of type builds
    :type fields_builds: List[str]

    :rtype: Union[BuildResponse, Tuple[BuildResponse, int], Tuple[BuildResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def build_beta_details_get_collection(filter_build=None, filter_id=None, fields_build_beta_details=None, limit=None, include=None, fields_builds=None):  # noqa: E501
    """build_beta_details_get_collection

     # noqa: E501

    :param filter_build: filter by id(s) of related &#39;build&#39;
    :type filter_build: List[str]
    :param filter_id: filter by id(s)
    :type filter_id: List[str]
    :param fields_build_beta_details: the fields to include for returned resources of type buildBetaDetails
    :type fields_build_beta_details: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_builds: the fields to include for returned resources of type builds
    :type fields_builds: List[str]

    :rtype: Union[BuildBetaDetailsResponse, Tuple[BuildBetaDetailsResponse, int], Tuple[BuildBetaDetailsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def build_beta_details_get_instance(id, fields_build_beta_details=None, include=None, fields_builds=None):  # noqa: E501
    """build_beta_details_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_build_beta_details: the fields to include for returned resources of type buildBetaDetails
    :type fields_build_beta_details: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_builds: the fields to include for returned resources of type builds
    :type fields_builds: List[str]

    :rtype: Union[BuildBetaDetailResponse, Tuple[BuildBetaDetailResponse, int], Tuple[BuildBetaDetailResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def build_beta_details_update_instance(id, build_beta_detail_update_request):  # noqa: E501
    """build_beta_details_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param build_beta_detail_update_request: BuildBetaDetail representation
    :type build_beta_detail_update_request: dict | bytes

    :rtype: Union[BuildBetaDetailResponse, Tuple[BuildBetaDetailResponse, int], Tuple[BuildBetaDetailResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        build_beta_detail_update_request = BuildBetaDetailUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
