import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_encryption_declaration_builds_linkages_request import AppEncryptionDeclarationBuildsLinkagesRequest  # noqa: E501
from openapi_server.models.app_encryption_declaration_response import AppEncryptionDeclarationResponse  # noqa: E501
from openapi_server.models.app_encryption_declarations_response import AppEncryptionDeclarationsResponse  # noqa: E501
from openapi_server.models.app_response import AppResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def app_encryption_declarations_app_get_to_one_related(id, fields_apps=None):  # noqa: E501
    """app_encryption_declarations_app_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]

    :rtype: Union[AppResponse, Tuple[AppResponse, int], Tuple[AppResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_encryption_declarations_builds_create_to_many_relationship(id, app_encryption_declaration_builds_linkages_request):  # noqa: E501
    """app_encryption_declarations_builds_create_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param app_encryption_declaration_builds_linkages_request: List of related linkages
    :type app_encryption_declaration_builds_linkages_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_encryption_declaration_builds_linkages_request = AppEncryptionDeclarationBuildsLinkagesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def app_encryption_declarations_get_collection(filter_platform=None, filter_app=None, filter_builds=None, fields_app_encryption_declarations=None, limit=None, include=None, fields_apps=None):  # noqa: E501
    """app_encryption_declarations_get_collection

     # noqa: E501

    :param filter_platform: filter by attribute &#39;platform&#39;
    :type filter_platform: List[str]
    :param filter_app: filter by id(s) of related &#39;app&#39;
    :type filter_app: List[str]
    :param filter_builds: filter by id(s) of related &#39;builds&#39;
    :type filter_builds: List[str]
    :param fields_app_encryption_declarations: the fields to include for returned resources of type appEncryptionDeclarations
    :type fields_app_encryption_declarations: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]

    :rtype: Union[AppEncryptionDeclarationsResponse, Tuple[AppEncryptionDeclarationsResponse, int], Tuple[AppEncryptionDeclarationsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_encryption_declarations_get_instance(id, fields_app_encryption_declarations=None, include=None, fields_apps=None):  # noqa: E501
    """app_encryption_declarations_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_encryption_declarations: the fields to include for returned resources of type appEncryptionDeclarations
    :type fields_app_encryption_declarations: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]

    :rtype: Union[AppEncryptionDeclarationResponse, Tuple[AppEncryptionDeclarationResponse, int], Tuple[AppEncryptionDeclarationResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
