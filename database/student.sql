USE [SQL]
GO
/****** Object:  Table [dbo].[user]    Script Date: 05/27/2015 03:24:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[user](
	[u_id] [int] NOT NULL,
	[u_name] [varchar](50) NULL,
	[u_pass] [varchar](50) NULL,
 CONSTRAINT [PK_user] PRIMARY KEY CLUSTERED 
(
	[u_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[user] ([u_id], [u_name], [u_pass]) VALUES (1, N'q', N'123')
/****** Object:  Table [dbo].[student]    Script Date: 05/27/2015 03:24:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[student](
	[r_id] [char](10) NOT NULL,
	[r_name] [char](10) NULL,
	[r_sex] [char](2) NULL,
	[r_class] [varchar](50) NULL,
	[r_max] [int] NULL,
 CONSTRAINT [PK_student] PRIMARY KEY CLUSTERED 
(
	[r_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[student] ([r_id], [r_name], [r_sex], [r_class], [r_max]) VALUES (N'1         ', N'q         ', N'男', N'1', 2)
INSERT [dbo].[student] ([r_id], [r_name], [r_sex], [r_class], [r_max]) VALUES (N'2         ', N'w         ', N'女', N'1', 10)
INSERT [dbo].[student] ([r_id], [r_name], [r_sex], [r_class], [r_max]) VALUES (N'3         ', N'e         ', N'男', N'2', 10)
INSERT [dbo].[student] ([r_id], [r_name], [r_sex], [r_class], [r_max]) VALUES (N'4         ', N'r         ', N'女', N'3', 10)
INSERT [dbo].[student] ([r_id], [r_name], [r_sex], [r_class], [r_max]) VALUES (N'5         ', N't         ', N'女', N'4', 10)
