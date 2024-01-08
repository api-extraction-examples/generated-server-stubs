import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.dns_record import DnsRecord  # noqa: E501
from openapi_server.models.dns_record_create import DnsRecordCreate  # noqa: E501
from openapi_server.models.dns_zone import DnsZone  # noqa: E501
from openapi_server.models.dns_zone_setup import DnsZoneSetup  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def configure_dns_for_site(site_id):  # noqa: E501
    """configure_dns_for_site

     # noqa: E501

    :param site_id: 
    :type site_id: str

    :rtype: Union[List[DnsZone], Tuple[List[DnsZone], int], Tuple[List[DnsZone], int, Dict[str, str]]
    """
    return 'do some magic!'


def create_dns_record(zone_id, dns_record):  # noqa: E501
    """create_dns_record

     # noqa: E501

    :param zone_id: 
    :type zone_id: str
    :param dns_record: 
    :type dns_record: dict | bytes

    :rtype: Union[DnsRecord, Tuple[DnsRecord, int], Tuple[DnsRecord, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        dns_record = DnsRecordCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_dns_zone(dns_zone_params):  # noqa: E501
    """create_dns_zone

     # noqa: E501

    :param dns_zone_params: 
    :type dns_zone_params: dict | bytes

    :rtype: Union[DnsZone, Tuple[DnsZone, int], Tuple[DnsZone, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        dns_zone_params = DnsZoneSetup.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_dns_record(zone_id, dns_record_id):  # noqa: E501
    """delete_dns_record

     # noqa: E501

    :param zone_id: 
    :type zone_id: str
    :param dns_record_id: 
    :type dns_record_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_dns_zone(zone_id):  # noqa: E501
    """delete_dns_zone

     # noqa: E501

    :param zone_id: 
    :type zone_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_dns_for_site(site_id):  # noqa: E501
    """get_dns_for_site

     # noqa: E501

    :param site_id: 
    :type site_id: str

    :rtype: Union[List[DnsZone], Tuple[List[DnsZone], int], Tuple[List[DnsZone], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_dns_records(zone_id):  # noqa: E501
    """get_dns_records

     # noqa: E501

    :param zone_id: 
    :type zone_id: str

    :rtype: Union[List[DnsRecord], Tuple[List[DnsRecord], int], Tuple[List[DnsRecord], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_dns_zone(zone_id):  # noqa: E501
    """get_dns_zone

     # noqa: E501

    :param zone_id: 
    :type zone_id: str

    :rtype: Union[DnsZone, Tuple[DnsZone, int], Tuple[DnsZone, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_dns_zones(account_slug=None):  # noqa: E501
    """get_dns_zones

     # noqa: E501

    :param account_slug: 
    :type account_slug: str

    :rtype: Union[List[DnsZone], Tuple[List[DnsZone], int], Tuple[List[DnsZone], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_individual_dns_record(zone_id, dns_record_id):  # noqa: E501
    """get_individual_dns_record

     # noqa: E501

    :param zone_id: 
    :type zone_id: str
    :param dns_record_id: 
    :type dns_record_id: str

    :rtype: Union[DnsRecord, Tuple[DnsRecord, int], Tuple[DnsRecord, int, Dict[str, str]]
    """
    return 'do some magic!'


def transfer_dns_zone(zone_id, account_id, transfer_account_id, transfer_user_id):  # noqa: E501
    """transfer_dns_zone

     # noqa: E501

    :param zone_id: 
    :type zone_id: str
    :param account_id: the account of the dns zone
    :type account_id: str
    :param transfer_account_id: the account you want to transfer the dns zone to
    :type transfer_account_id: str
    :param transfer_user_id: the user you want to transfer the dns zone to
    :type transfer_user_id: str

    :rtype: Union[DnsZone, Tuple[DnsZone, int], Tuple[DnsZone, int, Dict[str, str]]
    """
    return 'do some magic!'
