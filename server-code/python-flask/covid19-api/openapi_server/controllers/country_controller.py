import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.get_daily_report_all_countries200_response_inner import GetDailyReportAllCountries200ResponseInner  # noqa: E501
from openapi_server.models.get_latest_country_data_by_name200_response_inner import GetLatestCountryDataByName200ResponseInner  # noqa: E501
from openapi_server import util


def get_daily_report_all_countries(_date, date_format=None, format=None):  # noqa: E501
    """getDailyReportAllCountries

    Get daily report for all countries. Date is mandatory parametar. Date format is by ISO 8601 standard, but you can provide different format with date-format parameter. # noqa: E501

    :param _date: Date of the report.
    :type _date: str
    :param date_format: Date format. If you dont want to use ISO 8601 standard (YYYY-MM-DD), you can provide different format.
    :type date_format: str
    :param format: Format of the response
    :type format: str

    :rtype: Union[List[GetDailyReportAllCountries200ResponseInner], Tuple[List[GetDailyReportAllCountries200ResponseInner], int], Tuple[List[GetDailyReportAllCountries200ResponseInner], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_daily_report_by_country_code(code, _date, date_format=None, format=None):  # noqa: E501
    """getDailyReportByCountryCode

    Get daily report for specific country. Country code and date are mandatory in parametars. Country code is in ISO 3166-1 standard. It can be 2 chars (Alpha-2) or 3 chars (Alpha-3) type. Date format is by ISO 8601 standard, but you can provide different format with date-format parameter # noqa: E501

    :param code: Country code. Country code is by ISO 3166-1 standard. It can be 2 chars (Alpha-2) or 3 chars (Alpha-3) type.
    :type code: str
    :param _date: Date of the report.
    :type _date: str
    :param date_format: Date format. If you dont want to use ISO 8601 standard (YYYY-MM-DD), you can provide different format.
    :type date_format: str
    :param format: Format of the response
    :type format: str

    :rtype: Union[List[GetDailyReportAllCountries200ResponseInner], Tuple[List[GetDailyReportAllCountries200ResponseInner], int], Tuple[List[GetDailyReportAllCountries200ResponseInner], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_daily_report_by_country_name(name, _date, date_format=None, format=None):  # noqa: E501
    """getDailyReportByCountryName

    Get daily report for specific country. Country name and date are mandatory in parametars. Date format is by ISO 8601 standard, but you can provide different format with date-format parameter # noqa: E501

    :param name: Country name.
    :type name: str
    :param _date: Date of the report.
    :type _date: str
    :param date_format: Date format. If you dont want to use ISO 8601 standard (YYYY-MM-DD), you can provide different format.
    :type date_format: str
    :param format: Format of the response
    :type format: str

    :rtype: Union[List[GetDailyReportAllCountries200ResponseInner], Tuple[List[GetDailyReportAllCountries200ResponseInner], int], Tuple[List[GetDailyReportAllCountries200ResponseInner], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_latest_all_countries(format=None):  # noqa: E501
    """getLatestAllCountries

    Get latest data from all countries. # noqa: E501

    :param format: Format of the response
    :type format: str

    :rtype: Union[List[GetLatestCountryDataByName200ResponseInner], Tuple[List[GetLatestCountryDataByName200ResponseInner], int], Tuple[List[GetLatestCountryDataByName200ResponseInner], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_latest_country_data_by_code(code, format=None):  # noqa: E501
    """getLatestCountryDataByCode

    Get latest data for specific country. Country code and format are in parametars. Country code is in ISO 3166-1 standard. It can be 2 chars (Alpha-2) or 3 chars (Alpha-3) type. # noqa: E501

    :param code: Country code
    :type code: str
    :param format: Format of the response
    :type format: str

    :rtype: Union[List[GetLatestCountryDataByName200ResponseInner], Tuple[List[GetLatestCountryDataByName200ResponseInner], int], Tuple[List[GetLatestCountryDataByName200ResponseInner], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_latest_country_data_by_name(name, format=None):  # noqa: E501
    """getLatestCountryDataByName

    Get latest data for specific country. Country name and format are in parametars. # noqa: E501

    :param name: Name of the country
    :type name: str
    :param format: Format of the response
    :type format: str

    :rtype: Union[List[GetLatestCountryDataByName200ResponseInner], Tuple[List[GetLatestCountryDataByName200ResponseInner], int], Tuple[List[GetLatestCountryDataByName200ResponseInner], int, Dict[str, str]]
    """
    return 'do some magic!'
