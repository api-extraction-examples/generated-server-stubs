import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.sni_certificate import SniCertificate  # noqa: E501
from openapi_server import util


def provision_site_tls_certificate(site_id, certificate=None, key=None, ca_certificates=None):  # noqa: E501
    """provision_site_tls_certificate

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param certificate: 
    :type certificate: str
    :param key: 
    :type key: str
    :param ca_certificates: 
    :type ca_certificates: str

    :rtype: Union[SniCertificate, Tuple[SniCertificate, int], Tuple[SniCertificate, int, Dict[str, str]]
    """
    return 'do some magic!'


def show_site_tls_certificate(site_id):  # noqa: E501
    """show_site_tls_certificate

     # noqa: E501

    :param site_id: 
    :type site_id: str

    :rtype: Union[SniCertificate, Tuple[SniCertificate, int], Tuple[SniCertificate, int, Dict[str, str]]
    """
    return 'do some magic!'
