import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.get_daily_report_totals200_response_inner import GetDailyReportTotals200ResponseInner  # noqa: E501
from openapi_server.models.get_latest_totals200_response_inner import GetLatestTotals200ResponseInner  # noqa: E501
from openapi_server import util


def get_daily_report_totals(_date=None, date_format=None, format=None):  # noqa: E501
    """getDailyReportTotals

    Get daily report data for whole world. # noqa: E501

    :param _date: Date of the report. If you don&#39;t put this field all dates will be returned.
    :type _date: str
    :param date_format: Date format. If you dont want to use ISO 8601 standard (YYYY-MM-DD), you can provide different format.
    :type date_format: str
    :param format: Format of the response. If you don&#39;t put this field JSON will be response format.
    :type format: str

    :rtype: Union[List[GetDailyReportTotals200ResponseInner], Tuple[List[GetDailyReportTotals200ResponseInner], int], Tuple[List[GetDailyReportTotals200ResponseInner], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_latest_totals(format=None):  # noqa: E501
    """getLatestTotals

    Get latest data for whole world. # noqa: E501

    :param format: Format of the response
    :type format: str

    :rtype: Union[List[GetLatestTotals200ResponseInner], Tuple[List[GetLatestTotals200ResponseInner], int], Tuple[List[GetLatestTotals200ResponseInner], int, Dict[str, str]]
    """
    return 'do some magic!'
