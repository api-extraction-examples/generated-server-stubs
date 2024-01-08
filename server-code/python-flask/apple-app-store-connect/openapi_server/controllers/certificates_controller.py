import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.certificate_create_request import CertificateCreateRequest  # noqa: E501
from openapi_server.models.certificate_response import CertificateResponse  # noqa: E501
from openapi_server.models.certificates_response import CertificatesResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def certificates_create_instance(certificate_create_request):  # noqa: E501
    """certificates_create_instance

     # noqa: E501

    :param certificate_create_request: Certificate representation
    :type certificate_create_request: dict | bytes

    :rtype: Union[CertificateResponse, Tuple[CertificateResponse, int], Tuple[CertificateResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        certificate_create_request = CertificateCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def certificates_delete_instance(id):  # noqa: E501
    """certificates_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def certificates_get_collection(filter_certificate_type=None, filter_display_name=None, filter_serial_number=None, filter_id=None, sort=None, fields_certificates=None, limit=None):  # noqa: E501
    """certificates_get_collection

     # noqa: E501

    :param filter_certificate_type: filter by attribute &#39;certificateType&#39;
    :type filter_certificate_type: List[str]
    :param filter_display_name: filter by attribute &#39;displayName&#39;
    :type filter_display_name: List[str]
    :param filter_serial_number: filter by attribute &#39;serialNumber&#39;
    :type filter_serial_number: List[str]
    :param filter_id: filter by id(s)
    :type filter_id: List[str]
    :param sort: comma-separated list of sort expressions; resources will be sorted as specified
    :type sort: List[str]
    :param fields_certificates: the fields to include for returned resources of type certificates
    :type fields_certificates: List[str]
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[CertificatesResponse, Tuple[CertificatesResponse, int], Tuple[CertificatesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def certificates_get_instance(id, fields_certificates=None):  # noqa: E501
    """certificates_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_certificates: the fields to include for returned resources of type certificates
    :type fields_certificates: List[str]

    :rtype: Union[CertificateResponse, Tuple[CertificateResponse, int], Tuple[CertificateResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
