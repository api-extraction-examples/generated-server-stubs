import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def finance_reports_get_collection(filter_region_code, filter_report_date, filter_report_type, filter_vendor_number):  # noqa: E501
    """finance_reports_get_collection

     # noqa: E501

    :param filter_region_code: filter by attribute &#39;regionCode&#39;
    :type filter_region_code: List[str]
    :param filter_report_date: filter by attribute &#39;reportDate&#39;
    :type filter_report_date: List[str]
    :param filter_report_type: filter by attribute &#39;reportType&#39;
    :type filter_report_type: List[str]
    :param filter_vendor_number: filter by attribute &#39;vendorNumber&#39;
    :type filter_vendor_number: List[str]

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'
