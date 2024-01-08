import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.end_user_license_agreement_create_request import EndUserLicenseAgreementCreateRequest  # noqa: E501
from openapi_server.models.end_user_license_agreement_response import EndUserLicenseAgreementResponse  # noqa: E501
from openapi_server.models.end_user_license_agreement_update_request import EndUserLicenseAgreementUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.territories_response import TerritoriesResponse  # noqa: E501
from openapi_server import util


def end_user_license_agreements_create_instance(end_user_license_agreement_create_request):  # noqa: E501
    """end_user_license_agreements_create_instance

     # noqa: E501

    :param end_user_license_agreement_create_request: EndUserLicenseAgreement representation
    :type end_user_license_agreement_create_request: dict | bytes

    :rtype: Union[EndUserLicenseAgreementResponse, Tuple[EndUserLicenseAgreementResponse, int], Tuple[EndUserLicenseAgreementResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        end_user_license_agreement_create_request = EndUserLicenseAgreementCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def end_user_license_agreements_delete_instance(id):  # noqa: E501
    """end_user_license_agreements_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def end_user_license_agreements_get_instance(id, fields_end_user_license_agreements=None, include=None, fields_territories=None, limit_territories=None):  # noqa: E501
    """end_user_license_agreements_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_end_user_license_agreements: the fields to include for returned resources of type endUserLicenseAgreements
    :type fields_end_user_license_agreements: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_territories: the fields to include for returned resources of type territories
    :type fields_territories: List[str]
    :param limit_territories: maximum number of related territories returned (when they are included)
    :type limit_territories: int

    :rtype: Union[EndUserLicenseAgreementResponse, Tuple[EndUserLicenseAgreementResponse, int], Tuple[EndUserLicenseAgreementResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def end_user_license_agreements_territories_get_to_many_related(id, fields_territories=None, limit=None):  # noqa: E501
    """end_user_license_agreements_territories_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_territories: the fields to include for returned resources of type territories
    :type fields_territories: List[str]
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[TerritoriesResponse, Tuple[TerritoriesResponse, int], Tuple[TerritoriesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def end_user_license_agreements_update_instance(id, end_user_license_agreement_update_request):  # noqa: E501
    """end_user_license_agreements_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param end_user_license_agreement_update_request: EndUserLicenseAgreement representation
    :type end_user_license_agreement_update_request: dict | bytes

    :rtype: Union[EndUserLicenseAgreementResponse, Tuple[EndUserLicenseAgreementResponse, int], Tuple[EndUserLicenseAgreementResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        end_user_license_agreement_update_request = EndUserLicenseAgreementUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
